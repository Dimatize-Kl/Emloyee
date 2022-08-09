public class Main
{
    public static void main(String[] args) {
        String chislo = "IVMX";
        getNumber(chislo);
        
    }
    
    public static void getNumber(String chislo){
        int number = 0;
        for (int i = 0; i < chislo.length(); i++ ){
            switch (chislo.charAt(i)) {
                case 'I' :
                    if(chislo.endsWith("V") || chislo.endsWith("X") || chislo.endsWith("L") || chislo.endsWith("C") || chislo.endsWith("D") || chislo.endsWith("M")) {
                        number-=1;
                    } else {
                        number+=1;
                    }
                break;
                case 'V' :
                    if(chislo.endsWith("X") || chislo.endsWith("L") || chislo.endsWith("C") || chislo.endsWith("D") || chislo.endsWith("M")) {
                        number-=5;
                    } else {
                        number+=5;
                    }
                break;
                case 'X' :
                    if(chislo.endsWith("L") || chislo.endsWith("C") || chislo.endsWith("D") || chislo.endsWith("M")) {
                        number-=10;
                    } else {
                        number+=10;
                    }
                break;
                case 'L' :
                    if(chislo.endsWith("C") || chislo.endsWith("D") || chislo.endsWith("M")) {
                        number-=50;
                    } else {
                        number+=50;
                    }
                break;
                case 'C' :
                    if(chislo.endsWith("D") || chislo.endsWith("M")) {
                        number-=100;
                    } else {
                        number+=100;
                    }
                break;
                case 'D' :
                    if(chislo.endsWith("M")) {
                        number-=100;
                    } else {
                        number+=100;
                    }
                break;
                case 'M' : number+=1000;
                break;
            } 
        }
        if (number <= 3999 || number > 1) {
            System.out.println(number);
        } else {
            System.out.println("Число слишком большое или слишком маленькое");
        }
    }
    
}
