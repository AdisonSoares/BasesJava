package br.geekuniversity.secao21;

/**
 * @Conjuntos
 * Os conjuntos nao aceitam elementos repetidos, estrutura
 * de dados utilizado para nao ter repeticoes dentro do programa.
 *
 * @Gera_perfomance
 *
 * @Cast_do_i
 * Ao fazer um cast do i, o sistema vai transformar a numeracao retornada em i
 * para char de acordo com a tabela ascii:
 * for (int i = 97; i < 123; i++) {
 *             System.out.println((char)i);//cast
 *         }
 */
public class Programa64 {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();

        // Vazio
        System.out.println(conjunto);

        //Preenchimento
        conjunto.adiciona("Angela");
        conjunto.adiciona("Alberto");
        conjunto.adiciona("Bruna");
        conjunto.adiciona("Felix");
        conjunto.adiciona("Geraldo");
        conjunto.adiciona("Gilson");

        //Preenchido
        System.out.println(conjunto);

        //Removendo
        conjunto.remove("Bruna");

        //Preenchido
        System.out.println(conjunto);
    }
}
