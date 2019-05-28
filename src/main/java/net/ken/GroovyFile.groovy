package net.ken
/**
 * Created by Yang, Haiqiang on 2019/05/24.
 */
class GroovyFile {
    static void readFile() {
        new File("file.txt").eachLine {
            line -> println line
        }
    }
}
