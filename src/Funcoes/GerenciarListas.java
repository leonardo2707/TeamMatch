/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

/**
 *
 * @author emerson
 */
public class GerenciarListas {
    public NoPessoas inserir_na_lista(NoPessoas lista, String nome, int codigo) {
        NoPessoas novo = new NoPessoas();
        Pessoa pessoa = new Pessoa();

        pessoa.Pessoa(nome, codigo);
        novo.Cria_NoPessoas(pessoa);

        if (lista == null) {
            lista = novo;
        } else {
            NoPessoas ultimo = buscaUltima(lista);
            novo.setNoAntPessoa(ultimo);
            ultimo.setNoProxPessoa(novo);

        }
        
        return lista;
    }

    public void mostraNomes(NoPessoas lista) {
        NoPessoas mostra = lista;

        if (lista == null) {
            System.out.println("Não há valores");
        } else {
            while (mostra != null) {
                System.out.println("nome: " + mostra.getPessoa().getNome());
                mostra = mostra.getNoProxPessoa();
            }
        }
    }

    public NoPessoas buscaUltima(NoPessoas lista) {
        if (lista == null) {
            return null;
        }

        NoPessoas ultimo = lista;
        while (ultimo.getNoProxPessoa() != null) {
            ultimo = ultimo.getNoProxPessoa();
        }
        return ultimo;
    }
    
    //Da para usar esta função para ferificar se o nome ja existe ou não, só chamar ela e comparar
    //com o nome enviado, se eles forem iguais significa que ja existe
    public NoPessoas busca_Nome(String nome, NoPessoas lista) {
        if (lista == null) {
            return null;
        }

        NoPessoas verifica = lista;
        while (verifica != null){
            if(verifica.getPessoa().getNome().equals(nome))
            {
                break;
            }
            verifica = verifica.getNoProxPessoa();
        }
        return verifica;
    }

    public NoPessoas limparlista(NoPessoas lista) {
        NoPessoas no = lista;
        NoPessoas aux;
        while (no != null) {
            aux = no;
            no = no.getNoProxPessoa();
            aux = null;
        }
        lista = null;
        return lista;
    }

    public NoPessoas removerPosicaoNome(String nome, NoPessoas lista) {

        if ((lista != null)) {
            NoPessoas no = lista;
            NoPessoas aux = lista;
            NoPessoas anterior;
            NoPessoas ultimo;
            int contador = 0;
            
            while(aux != null)
            {
                contador++;
                aux = aux.getNoProxPessoa();
            }
            if(contador == 1)
            {
                lista = null;
                System.out.println("só existe um nome na lista");
                return null;
            }
            
            no = busca_Nome(nome, lista);
            ultimo = buscaUltima(lista);
            
            if(no == null)
            {
                System.out.println("nome não existe na lista");
                return lista;
            }
                
            if(no.getPessoa().getNome().equals(lista.getPessoa().getNome())) //verifica se é o primeiro da lista
            {
                System.out.println("o nome é o primeiro da lista");
                aux = lista.getNoProxPessoa();
                lista = null;
                return aux; 
            }else if(no.getPessoa().getNome().equals(ultimo.getPessoa().getNome())) //verifica se é o ultimo valor
            {
                System.out.println("O nome é o ultimo da lista");
                aux = no.getNoAntPessoa();
                ultimo = null;
                aux.setNoProxPessoa(null);
                return lista;
            }else
            {
                aux = no.getNoProxPessoa();
                anterior = no.getNoAntPessoa();
                no = null;
                anterior.setNoProxPessoa(aux);
                return lista;   
            }
                
        }
        else{
            System.out.println("lista Vazia");
            return null;
        }
    }
}
