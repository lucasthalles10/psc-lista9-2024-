public class Main {
    public static void main(String[] args) {
        // Criaçao de tres personagens usando a fabrica de personagens
        PersonagemDragonBall goku = PersonagemFactory.criarPersonagem("Goku");
        PersonagemDragonBall gohan = PersonagemFactory.criarPersonagem("Gohan");
        PersonagemDragonBall dende = PersonagemFactory.criarPersonagem("Dende");

        // Verifica se o personagem Goku pode se transformar (implementa a interface Transformavel)
        if (goku instanceof Transformavel) {
            // Realiza a transformação de Goku e imprime o resultado
            System.out.println(((Transformavel) goku).transformar(5));
        }

        // Verifica se o personagem Gohan pode se transformar (implementa a interface Transformavel)
        if (gohan instanceof Transformavel) {
            // Realiza a transformação de Gohan e armazena o resultado
            String resultadoTransformacao = ((Transformavel) gohan).transformar(5);
            // Se a transformação não for possível, tenta uma transformação com um nível menor
            if (resultadoTransformacao.contains("Não foi possível")) {
                resultadoTransformacao = ((Transformavel) gohan).transformar(3);
            }
            // Imprime o resultado da transformação (seja a tentativa inicial ou a segunda)
            System.out.println(resultadoTransformacao);
        }

        // Verifica se o personagem Dende é um Namekuseijin (implementa a interface Namekuseijin)
        if (dende instanceof Namekuseijin) {
            // Faz um desejo com o personagem Dende e imprime o resultado
            System.out.println(((Namekuseijin) dende).fazerDesejo("Eu quero mais poder e força"));
        }
    }
}