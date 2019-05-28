package net.ken
/**
 * Created by Yang, Haiqiang on 2019/05/27.
 */
class Shell {
    public static void main(String[] args) {
        def process = "cmd /c dir".execute()
        println "Found text ${process.text}"
    }
}
