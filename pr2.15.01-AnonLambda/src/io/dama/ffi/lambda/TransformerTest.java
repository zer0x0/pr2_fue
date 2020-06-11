package io.dama.ffi.lambda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TransformerTest {

    @Test
    public void testIdentitaet() {
        var l1 = new ArrayList<Integer>();
        var l2 = new ArrayList<Integer>();
        l1.add(1); l2.add(1);
        l1.add(2); l2.add(2);
        l1.add(3); l2.add(3);
        l1.add(4); l2.add(4);
        l1.add(5); l2.add(5);
        assertEquals(l2, TransformPerformer.perform(l1, new Transformer<Integer>() {

            @Override
            public Integer transform(Integer in) {
                return in;
            }

        }));
    }

    @Test
    public void testQuadrat() {
        var l1 = new ArrayList<Integer>();
        var l2 = new ArrayList<Integer>();
        l1.add(1); l2.add(1);
        l1.add(2); l2.add(4);
        l1.add(3); l2.add(9);
        l1.add(4); l2.add(16);
        l1.add(5); l2.add(25);
        assertEquals(l2, TransformPerformer.perform(l1, new Transformer<Integer>() {

            @Override
            public Integer transform(Integer in) {
                return in * in;
            }

        }));
    }

    @Test
    public void testCaesarHin() {
        var l1 = new ArrayList<Character>();
        var l2 = new ArrayList<Character>();
        l1.add('G'); l2.add('J');
        l1.add('E'); l2.add('H');
        l1.add('H'); l2.add('K');
        l1.add('E'); l2.add('H');
        l1.add('I'); l2.add('L');
        l1.add('M'); l2.add('P');
        assertEquals(l2, TransformPerformer.perform(l1, new Transformer<Character>() {

            @Override
            public Character transform(Character in) {
                if ((' ' == in.charValue()) || ('.' == in.charValue()) || ('\n' == in.charValue()) ) {
                    return in;
                } else if (((int)in) <= ((int) 'X')) {
                    return (Character.valueOf( (char) (((int) in) + 3)));
                } else {
                    return (Character.valueOf( (char) (((int) in) - 23)));
                }

            }

        }));
    }

    @Test
    public void testCaesarHer() {
        var l1 = new ArrayList<Character>();
        var l2 = new ArrayList<Character>();
        l1.add('G'); l2.add('J');
        l1.add('E'); l2.add('H');
        l1.add('H'); l2.add('K');
        l1.add('E'); l2.add('H');
        l1.add('I'); l2.add('L');
        l1.add('M'); l2.add('P');
        assertEquals(l1, TransformPerformer.perform(l2, new Transformer<Character>() {

            @Override
            public Character transform(Character in) {
                if ((' ' == in.charValue()) || ('.' == in.charValue()) || ('\n' == in.charValue()) ) {
                    return in;
                } else if (((int)in) >= ((int) 'C')) {
                    return (Character.valueOf( (char) (((int) in) - 3)));
                } else {
                    return (Character.valueOf( (char) (((int) in) + 23)));
                }

            }

        }));
    }
   
}
