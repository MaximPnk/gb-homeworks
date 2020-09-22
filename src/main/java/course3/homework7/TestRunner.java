package course3.homework7;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class TestRunner {
    private static Method before = null;
    private static Method after = null;
    private static ArrayList<Method> tests = new ArrayList<>();

    public static void start(Class className) {
        Method[] methods = className.getMethods();

        if (methods.length > 0) {
            checkForBeforeAndAfter(methods);
            checkForTest(methods);
            try {
                runTests(className);
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }

    private static void checkForBeforeAndAfter(Method[] methods) {
        int beforeAmount = 0, afterAmount = 0;
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            if (Arrays.stream(annotations).map(a -> a.annotationType().getSimpleName()).anyMatch(a -> a.equals("BeforeSuite"))) {
                before = method;
                beforeAmount++;
            }
            if (Arrays.stream(annotations).map(a -> a.annotationType().getSimpleName()).anyMatch(a -> a.equals("AfterSuite"))) {
                after = method;
                afterAmount++;
            }
        }
        if (beforeAmount > 1 || afterAmount > 1) {
            throw new RuntimeException();
        }
    }

    private static void checkForTest(Method[] methods) {
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            if (annotations.length > 0) {
                if (Arrays.stream(annotations).anyMatch(a -> a.annotationType().getSimpleName().equals("Test")) &&
                        Arrays.stream(annotations).noneMatch(a -> a.annotationType().getSimpleName().equals("BeforeSuite")) &&
                        Arrays.stream(annotations).noneMatch(a -> a.annotationType().getSimpleName().equals("AfterSuite"))) {
                    tests.add(method);
                }
            }
        }
    }

    private static void runTests(Class className) throws InvocationTargetException, IllegalAccessException {
        if (before != null) {
            before.invoke(className);
        }

        for (int i = 10; i >= 0; i--) {
            for (Method test : tests) {
                if (test.getAnnotation(Test.class).priority() == i) {
                    test.invoke(className);
                }
            }
        }

        if (after != null) {
            after.invoke(className);
        }
    }
}
