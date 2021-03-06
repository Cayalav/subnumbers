package subnumbers;
import java.math.BigInteger;
import java.sql.Types;

public class Subnumbers {

    public static void main(String[] args) {
        
        
        int conseNum = 13; //Valor minimo a probar es #Digitos - 1
        String numStr = "7316717653133062491922511967442657474"
                + "23553491949349698352031277450632623957831801"
                + "69848018694788518438586156078911294949545950"
                + "17379583319528532088055111254069874715852386"
                + "30507156932909632952274430435576689664895044"
                + "52445231617318564030987111217223831136222989"
                + "34233803081353362766142828064444866452387493"
                + "03589072962904915604407723907138105158593079"
                + "60866701724271218839987979087922749219016997"
                + "20888093776657273330010533678812202354218097"
                + "51254540594752243525849077116705560136048395"
                + "86446706324415722155397536978179778461740649"
                + "55149290862569321978468622482839722413756570"
                + "56057490261407972968652414535100474821663704"
                + "84403199890008895243450658541227588666881164"
                + "27171479924442928230863465674813919123162824"
                + "58617866458359124566529476545682848912883142"
                + "60769004224219022671055626321111109370544217"
                + "50694165896040807198403850962455444362981230"
                + "98787992724428490918884580156166097919133875"
                + "49920052406368991256071760605886116467109405"
                + "07754100225698315520005593572972571636269561"
                + "882670428252483600823257530420752963450";
        
        int[] digits = numStr.chars().map(c -> c-'0').toArray(); // Se realiza esta conversión a Array para que las operaciones sean mas manejables
        int lengthArray = digits.length;
        int mult = 1;
        int multMax = Integer.MIN_VALUE;
        String secTemp = "";
        String secDef = "";
        //lengthArray;
        for (int i = 0; i < lengthArray-conseNum; i++) { // Se prueba inicialmente para el primer caso que es 7*3*1*6 en ganas de comprobar el loop multiplicativo
            
            for (int j = i; j < i+conseNum; j++) {
              mult = digits[j]*mult;
              secTemp = secTemp+  String.valueOf(digits[j]);
            }
            if (mult >= multMax) {
                multMax = mult;
                secDef = secTemp;
            }
            mult = 1; // Reinicio de datos
            secTemp = "";
        }
        System.out.println(multMax);
        System.out.println("Bajo la secuencia: "+secDef);
        
    }
}
