// 
// Decompiled by Procyon v0.5.36
// 

package domain;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class RandomCypher
{
    private Map<Character, Character> codes;

    public RandomCypher() {
        (this.codes = new HashMap<Character, Character>()).put('a', 'f');
        this.codes.put('b', 'n');
        this.codes.put('c', 'd');
        this.codes.put('d', 'v');
        this.codes.put('e', 'g');
        this.codes.put('f', 'x');
        this.codes.put('g', 'z');
        this.codes.put('h', 'o');
        this.codes.put('i', 'l');
        this.codes.put('j', 'r');
        this.codes.put('k', 'u');
        this.codes.put('l', 'a');
        this.codes.put('m', 'k');
        this.codes.put('n', 'i');
        this.codes.put('o', 's');
        this.codes.put('p', 'e');
        this.codes.put('q', 'x');
        this.codes.put('r', 'p');
        this.codes.put('s', 'b');
        this.codes.put('t', 'y');
        this.codes.put('u', 'm');
        this.codes.put('v', 'h');
        this.codes.put('w', 'w');
        this.codes.put('x', 't');
        this.codes.put('y', 'q');
        this.codes.put('z', 'j');
        this.codes.put(' ',' ');
    }

    public char[] encypher(final char[] message) {
        final char[] result = new char[message.length];
        for (int i = 0; i < message.length; ++i) {
            result[i] = this.codes.get(message[i]);
        }
        return result;
    }

    public char[] decypher(final char[] message) {
        final char[] result = new char[message.length];
        for (int i = 0; i < message.length; ++i) {
            result[i] = this.getChar(message[i]);
        }
        return result;
    }

    private Character getChar(final char cypher) {
        for (final Map.Entry<Character, Character> e : this.codes.entrySet()) {
            if (e.getValue() == cypher) {
                return e.getKey();
            }
        }
        return cypher;
    }
}