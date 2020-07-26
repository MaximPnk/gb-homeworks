package homework8.task7;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MyStringBuilder {
    private StringBuilder stringBuilder;
    private static ArrayList<StringBuilder> save = new ArrayList<>();
    private StringBuilder undoSb;

    public MyStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    //добавил всем методам, даже length и т.п., потому что устал))
    //хотя в идеале добавлять нужно только тем, которые меняют объект

    public MyStringBuilder undo() {
         MyStringBuilder undoStringBuilder = new MyStringBuilder(save.get(save.size()-1));
         save.remove(save.size()-1);
         return undoStringBuilder;
    }

    public StringBuilder append(Object obj) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(obj);
    }

    public StringBuilder append(String str) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(str);
    }

    public StringBuilder append(StringBuffer sb) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(sb);
    }

    public StringBuilder append(CharSequence s) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(s);
    }

    public StringBuilder append(CharSequence s, int start, int end) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(s, start, end);
    }

    public StringBuilder append(char[] str) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(str);
    }

    public StringBuilder append(char[] str, int offset, int len) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(str, offset, len);
    }

    public StringBuilder append(boolean b) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(b);
    }

    public StringBuilder append(char c) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(c);
    }

    public StringBuilder append(int i) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(i);
    }

    public StringBuilder append(long lng) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(lng);
    }

    public StringBuilder append(float f) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(f);
    }

    public StringBuilder append(double d) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.append(d);
    }

    public StringBuilder appendCodePoint(int codePoint) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.appendCodePoint(codePoint);
    }

    public StringBuilder delete(int start, int end) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.delete(start, end);
    }

    public StringBuilder deleteCharAt(int index) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.deleteCharAt(index);
    }

    public StringBuilder replace(int start, int end, String str) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.replace(start, end, str);
    }

    public StringBuilder insert(int index, char[] str, int offset, int len) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(index, str, offset, len);
    }

    public StringBuilder insert(int offset, Object obj) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, obj);
    }

    public StringBuilder insert(int offset, String str) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, str);
    }

    public StringBuilder insert(int offset, char[] str) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, str);
    }

    public StringBuilder insert(int dstOffset, CharSequence s) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(dstOffset, s);
    }

    public StringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(dstOffset, s, start, end);
    }

    public StringBuilder insert(int offset, boolean b) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, b);
    }

    public StringBuilder insert(int offset, char c) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, c);
    }

    public StringBuilder insert(int offset, int i) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, i);
    }

    public StringBuilder insert(int offset, long l) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, l);
    }

    public StringBuilder insert(int offset, float f) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, f);
    }

    public StringBuilder insert(int offset, double d) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.insert(offset, d);
    }

    public int indexOf(String str) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.lastIndexOf(str, fromIndex);
    }

    public StringBuilder reverse() {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.reverse();
    }

    public int length() {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.length();
    }

    public int capacity() {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.capacity();
    }

    public void ensureCapacity(int minimumCapacity) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        stringBuilder.ensureCapacity(minimumCapacity);
    }

    public void trimToSize() {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        stringBuilder.trimToSize();
    }

    public void setLength(int newLength) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        stringBuilder.setLength(newLength);
    }

    public char charAt(int index) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.charAt(index);
    }

    public int codePointAt(int index) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.codePointAt(index);
    }

    public int codePointBefore(int index) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        stringBuilder.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public void setCharAt(int index, char ch) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        stringBuilder.setCharAt(index, ch);
    }

    public String substring(int start) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.substring(start);
    }

    public CharSequence subSequence(int start, int end) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.subSequence(start, end);
    }

    public String substring(int start, int end) {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.substring(start, end);
    }

    public IntStream chars() {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.chars();
    }

    public IntStream codePoints() {
        undoSb = new StringBuilder(stringBuilder.toString());
        save.add(undoSb);
        return stringBuilder.codePoints();
    }

    @Override
    public String toString() {
        return String.valueOf(stringBuilder);
    }
}
