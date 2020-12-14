package com.company;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Key {

    HashMap<Character, Character> keyset = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    StringBuilder translateBuilder = new StringBuilder();


    public void instantiateKey() {


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
        keyset.put('u', 'v');
        keyset.put('v', 'x');
        keyset.put('x', 'y');
        keyset.put('y', 'z');
        keyset.put('z', 'a');

        ArrayList<Character> arraylistAlphabet = new ArrayList<>();
        for (char chr = 'a'; chr < 'z'; chr++) {
            arraylistAlphabet.addAll(Collections.singleton(chr));
        }



        Collections.shuffle(arraylistAlphabet);
        System.out.println(arraylistAlphabet);
        Iterator arrayiterror = arraylistAlphabet.iterator();

        for (Character ce : keyset.values()) {
                keyset.replace(ce, (Character) arrayiterror.next());
            }

        keyset.put(' ', ' ');
        System.out.println(keyset);


            Scanner scanner = new Scanner(System.in);
            String keyword = scanner.nextLine();
            char[] StringtoArray = keyword.toCharArray();

            for (char ac : StringtoArray) {
                if (keyset.containsKey(ac)) {
                    sb.append(keyset.get(ac));

                }


            }

            System.out.println(sb);



        }

        public void translator(){

        String translatedword = null;

        String finalword = sb.toString();

        char [] finalwordarray = finalword.toCharArray();

            System.out.println(Arrays.toString(finalwordarray) + " is the final word");

        for(char sbc: finalwordarray){
            for(Character caa: keyset.keySet()){
                if(keyset.get(caa).equals(sbc)){

                    translateBuilder.append(caa);


                }

            }
        }
            translatedword = translateBuilder.toString();

            System.out.println(translatedword);





        }




    }


