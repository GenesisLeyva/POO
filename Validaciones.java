public class Validaciones{

	public static boolean validarCuadraturaInt(MatrizInt m1, MatrizInt m2){
		if((m1.getRenglones()==m2.getRenglones()) && (m1.getColumnas()==m2.getColumnas()))
			return true;
			else return false;
	}

	public static boolean validarMultiplicabilidadInt(MatrizInt m1, MatrizInt m2){
		if(m1.getColumnas()==m2.getRenglones())
		return true;
		else return false;
	}

	public static boolean validarCuadraturaDouble(MatrizDouble m_1, MatrizDouble m_2){
		if((m_1.getRenglones()==m_2.getRenglones()) && (m_1.getColumnas()==m_2.getColumnas()))
			return true;
			else return false;
	}

	public static boolean validarMultiplicabilidadDouble(MatrizDouble m_1, MatrizDouble m_2){
		if(m_1.getColumnas()==m_2.getRenglones())
		return true;
		else return false;
	}
} // Fin clase Validaciones
