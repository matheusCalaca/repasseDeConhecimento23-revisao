package br.com.matheuscalaca.revisao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Revisao {

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable("nome") String nome){
        String saudacao = "Olá, ";
        saudacao = saudacao + nome;

        return saudacao;
    }

    @GetMapping("maiorQue18/{idade}")
    public String maiorQue18(@PathVariable("idade") int idadeDaPessoa){

        if(idadeDaPessoa >= 18){
            return "pode Dirigir";
        } else {

            return "Não porde Dirigir";
        }

    }

    @GetMapping("alunos/comprimentar")
    public void comprimentar(){
        String[] alunos= {"Calaça", "Luis", "Ana", "marcos"};

        for(int i = 0; i < alunos.length; i++){
            System.out.println("olá, "+alunos[i]);
        }

    }

    @GetMapping("numeroPar")
    public void numeroParOuImpar(){
        int[] numeros = {1,2,3,4,5,6};
        Integer[] numerosPares = new Integer[3];
        Integer[] numerosImpares = new Integer[3];
        for(int posicao = 0; posicao < numeros.length; posicao++ ){
            int restoDaDivisao = numeros[posicao] % 2;
            Boolean jaFoiAdicionado = false;
            if(restoDaDivisao == 0){
                for(int i = 0 ; i < numerosPares.length; i++){
                    if(numerosPares[i] == null && !jaFoiAdicionado){
                        numerosPares[i] =  numeros[posicao];
                        jaFoiAdicionado = true;
                    }
                }

            }else {
                for (int i = 0; i < numerosImpares.length; i++){
                    if(numerosImpares[i] == null && !jaFoiAdicionado){
                        numerosImpares[i] = numeros[posicao];
                        jaFoiAdicionado=true;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(numerosPares[i]);
            System.out.println(numerosImpares[i]);
        }

    }


}
