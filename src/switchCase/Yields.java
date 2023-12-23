package switchCase;

import jdk.jshell.spi.ExecutionControl;

import java.util.Optional;

public class Yields {
    public static void main(String[] args){
        char s='A';
        int ans=switch (s){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                yield -1;
        };
        System.out.println(ans);
    }
}
