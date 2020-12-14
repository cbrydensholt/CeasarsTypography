package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class KeyTest {

    @Test
    void instantiateKey() {

        HashMap<Character, Character> keyset = new HashMap<>();

        keyset.put('a', 'b');
        keyset.put('b', 'c');
        keyset.put('c', 'd');
        keyset.put('d', 'e');
        keyset.put('e', 'f');
        keyset.put('f', 'g');
        keyset.put('g', 'h');
        keyset.put('h', 'i');
        keyset.put('i', 'j');
        keyset.put('j', 'k');
        keyset.put('k', 'l');
        keyset.put('l', 'm');
        keyset.put('m', 'n');
        keyset.put('n', 'o');
        keyset.put('o', 'p');
        keyset.put('p', 'q');
        keyset.put('q', 'r');
        keyset.put('r', 's');
        keyset.put('s', 't');
        keyset.put('t', 'u');
        keyset.put('y', 'v');
        keyset.put('v', 'x');
        keyset.put('x', 'y');
        keyset.put('y', 'z');
        keyset.put('z', 'æ');
        keyset.put('æ', 'ø');
        keyset.put('ø', 'å');
        keyset.put('å', 'a');
        keyset.put(' ', ' ');


        String test = "test is good";
        StringBuilder sb = new StringBuilder();
        char[] StringtoArray = test.toCharArray();

        for(char c: StringtoArray){
            if(keyset.containsKey(c)){
                sb.append(keyset.get(c));
                System.out.println(keyset.get(c));


            }


        }

        System.out.println(sb);


    }

    @Test
    void mixKeys(){

        ArrayList<Character> arraylistAlphabet = new ArrayList<>();
        for(char chr = 'a'; chr<'z'; chr++){
            arraylistAlphabet.addAll(Collections.singleton(chr));
        }



        System.out.println(arraylistAlphabet.size());


    }


}