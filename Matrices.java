import java.util.*;
public class Matrices{

	public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
	    int opcion;

	    System.out.println("1) Matriz de enteros ");
	    System.out.println("2) Matriz de dobles ");
	    System.out.println("Que tipo de Matriz desea utilizar?: ");
	    opcion= reader.nextInt();

	    switch(opcion){
            case 1:
                System.out.println("Capture los datos de Matriz 1: ");
                MatrizInt m1 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                System.out.println("Capture los datos de Matriz 2: ");
                MatrizInt m2 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));

                MatrizInt m3;
                MatrizInt m4;
                MatrizInt m5;

                m1.iniciarMatInt();
                System.out.println();
                System.out.println("Matriz 1: ");
                m1.imprimirMatInt();

                m2.iniciarMatInt();
                System.out.println();
                System.out.println("Matriz 2: ");
                m2.imprimirMatInt();

                m4 = OperacionesMatrices.transponerMatInt(m1);
                System.out.println();
                System.out.println("Transpuesta Matriz 1: ");
                m4.imprimirMatInt();


                if (Validaciones.validarCuadraturaInt(m1,m2)){
                    m3 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
                    m3 = OperacionesMatrices.sumarMatInt(m1,m2);
                    System.out.println();
                    System.out.println("Matriz 3 = Matriz 1 + Matriz 2");
                    m3.imprimirMatInt();

                }
                else System.out.println("No son cuadradas, no se puede realizar la suma");


                if (Validaciones.validarMultiplicabilidadInt(m1,m2)){
                    m3 = new MatrizInt(m1.getRenglones(), m2.getColumnas());
                    m3 = OperacionesMatrices.multiplicarMatInt(m1,m2);
                    System.out.println();
                    System.out.println("Matriz 3 = Matriz 1 * Matriz 2");
                    m3.imprimirMatInt();
                    m3.imprimirMatIntG();
                }
                else System.out.println("No son multiplicables");
        break;
            case 2:
                System.out.println("Capture los datos de Matriz 1: ");
                MatrizDouble m_1 =new MatrizDouble(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
                System.out.println("Capture los datos de Matriz 2: ");
                MatrizDouble m_2 =new MatrizDouble(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));

                MatrizDouble m_3;
                MatrizDouble m_4;
                MatrizDouble m_5;

                m_1.iniciarMatDouble();
                System.out.println();
                System.out.println("Matriz 1: ");
                m_1.imprimirMatDouble();

                m_2.iniciarMatDouble();
                System.out.println();
                System.out.println("Matriz 2: ");
                m_2.imprimirMatDouble();

                m_3 = OperacionesMatrices.transponerMatDouble(m_1);
                System.out.println();
                System.out.println("Transpuesta Matriz 1: ");
                m_3.imprimirMatDouble();

                if (Validaciones.validarCuadraturaDouble(m_1,m_2)){
                    m_4 = new MatrizDouble(m_1.getRenglones(), m_1.getColumnas());
                    m_4 = OperacionesMatrices.sumarMatDouble(m_1,m_2);
                    System.out.println();
                    System.out.println("Matriz = Matriz 1 + Matriz 2");
                    m_4.imprimirMatDouble();

                }
                else System.out.println("No son cuadradas, no se puede realizar la suma");

                if (Validaciones.validarMultiplicabilidadDouble(m_1,m_2)){
                    m_5 = new MatrizDouble(m_1.getRenglones(), m_2.getColumnas());
                    m_5 = OperacionesMatrices.multiplicarMatDouble(m_1,m_2);
                    System.out.println();
                    System.out.println("Matriz = Matriz 1 * Matriz 2");
                    m_5.imprimirMatDouble();
                    m_5.imprimirMatDoubleG();
                }
                else System.out.println("No son multiplicables");


                break;
            default: System.out.println("No existe tal opcion");
                break;


	    }
	}
}

