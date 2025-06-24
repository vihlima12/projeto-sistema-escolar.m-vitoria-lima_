import java.util.Scanner; 

public class SistemaEscolar {
   public static void main (String[] args){
     double notas []=new double [8];
     Scanner sc = new Scanner (System.in);

System.out.println ("digite a primeira nota");
notas[0] = sc.nextDouble();
System.out.println ("digite a segunda nota");
notas[1] = sc.nextDouble();
System.out.println ("digite a terceira nota");
notas[2] = sc.nextDouble();
System.out.println ("digite a quarta nota");
notas[3] = sc.nextDouble();
System.out.println ("digite a quinta nota");
notas[4] = sc.nextDouble();
System.out.println ("digite a sexta nota");
notas[5] = sc.nextDouble();
System.out.println ("digite a setima nota");
notas[6] = sc.nextDouble();
System.out.println ("digite a oitava nota");   
notas[7]=sc.nextDouble();
 
 double media1Bimestre = (notas[0]+notas[1])/2;
 double media2Bimestre = (notas[2]+notas[3])/2;
 double media1Semestre = (media1Bimestre+media2Bimestre)/2;

 double media3Bimestre = (notas[4]+notas[5])/2;
 double media4Bimestre = (notas[6]+notas[7])/2;
 double media2Semestre = (media3Bimestre+media4Bimestre)/2;

 double mediaFinal = (media1Semestre+media2Semestre)/2; 

System.out.println("Bimestre 1:" + media1Bimestre);
System.out.println("Bimestre 2:" + media2Bimestre);
System.out.println("Semestre 1:" + media1Semestre);
System.out.println("Bimestre 3:" + media3Bimestre);
System.out.println("Bimestre 4:" + media4Bimestre);
System.out.println("Semestre 2:" + media2Semestre);
System.out.println("Media Final:" + mediaFinal);

   }  
   
}




