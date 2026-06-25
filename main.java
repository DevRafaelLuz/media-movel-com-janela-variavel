public static void main(String[] args) {
    int vetorDados[] = {7, 23, 45, 12, 89, 34, 56, 18, 72, 91, 3, 64, 27, 50, 81, 14, 38, 95, 60, 9};
    int janela = 2;
    int vetorSaida[] = new int[vetorDados.length - janela + 1];
    int i;

    for (i = 0; i < vetorDados.length; i++) {
        if (i + 1 >= vetorDados.length) {
            break;
        }
        
        vetorSaida[i] = (vetorDados[i] + vetorDados[i + 1]) / janela;
    }

    for (i = 0; i < vetorSaida.length; i++) {
        System.out.print(vetorSaida[i] + " ");
    }
}