package net.ken

import org.codehaus.groovy.runtime.typehandling.GroovyCastException

/**
 * Created by Yang, Haiqiang on 2019/05/21.
 */
class Groovy2 {
    public static void main(String[] args) {


        // for single char strings, both are the same
        assert ((char) "c").class == Character
        assert ("c" as char).class == Character

        // for multi char strings they are not
        try {
            ((char) 'cx') == 'c'
            assert false: 'will fail - not castable'
        } catch (GroovyCastException e) {
        }
        assert ('cx' as char) == 'c'
        assert 'cx'.asType(char) == 'c'


    }
}
