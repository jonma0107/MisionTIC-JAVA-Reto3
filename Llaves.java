import java.util.ArrayList;

class Llaves {

	public ArrayList<String> edificios(ArrayList<String> listaLlaves) {
		ArrayList<String> diferentes = new ArrayList<>();

		for (String key: listaLlaves)
			if (!diferentes.contains(key))
				diferentes.add(key);

		return diferentes;
	}

	public ArrayList<Integer> encontrada(ArrayList<Integer> llavesEncontradas, ArrayList<String> listaEdificios, String nombreEdificios) {
		ArrayList<Integer> llaves = new ArrayList<>();

		for (int elem: llavesEncontradas)
			if (listaEdificios.get(elem).equals(nombreEdificios))
				llaves.add(elem);

		return llaves;
	}

	public ArrayList faltantes(ArrayList numeroHabitaciones, ArrayList llavesEncontradas) {
		ArrayList faltante = new ArrayList();

		for (Object habitacion: numeroHabitaciones)
			if (!llavesEncontradas.contains(habitacion))
				faltante.add(habitacion);

		return faltante;
	}

	public Integer diferencia(ArrayList<Integer> numeroHabitaciones, ArrayList<Integer> llavesEncontradas) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (Integer m : numeroHabitaciones) {
            if (llavesEncontradas.contains(m)) {
            } else {
                lista.add(m);
            }
        }
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (Integer m : llavesEncontradas) {
            if (numeroHabitaciones.contains(m)) {
            } else {
                lista2.add(m);
            }
        }
        if (lista.size() > lista2.size()) {
            return lista2.size();
        } else {
            return lista.size();
        }
    }

}