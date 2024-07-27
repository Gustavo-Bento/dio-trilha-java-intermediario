# Sistema Bancário

Este projeto é um exemplo de um sistema bancário simples implementado em Java. Ele demonstra conceitos de orientação a objetos, incluindo herança, encapsulamento e polimorfismo.

## Estrutura do Projeto

O projeto consiste nas seguintes classes:

- `Banco`: Representa um banco que possui uma lista de clientes.
- `Cliente`: Representa um cliente do banco.
- `Conta`: Uma classe abstrata que representa uma conta bancária.
  - `ContaCorrente`: Representa uma conta corrente.
  - `ContaPoupanca`: Representa uma conta poupança.
- `IConta`: Uma interface que define as operações que uma conta deve implementar.
- `Main`: Classe principal que demonstra o uso das classes do sistema.

## Diagrama de Classes

```mermaid
classDiagram
    class Banco {
        -String nome
        -List<Cliente> clientes
        +String getNome()
        +void setNome(String nome)
        +void adicionarCliente(Cliente cliente)
        +List<String> listarClientes()
    }
    
    class Cliente {
        -String nome
        +String getNome()
        +void setNome(String nome)
    }

    class Conta {
        #int agencia
        #int numeroConta
        #double saldo
        #Cliente cliente
        +Conta(Cliente cliente)
        +void depositar(double valor)
        +void sacar(double valor)
        +void transferir(double valor, IConta contaDestino)
        +int getAgencia()
        +int getNumeroConta()
        +double getSaldo()
        +Cliente getCliente()
        #void imprimirInfoConta()
    }

    class ContaCorrente {
        +ContaCorrente(Cliente cliente)
        +void imprimirExtrato()
    }

    class ContaPoupanca {
        +ContaPoupanca(Cliente cliente)
        +void imprimirExtrato()
    }

    class IConta {
        +void depositar(double valor)
        +void sacar(double valor)
        +void transferir(double valor, IConta contaDestino)
        +void imprimirExtrato()
    }

    Banco "1" --> "0..*" Cliente
    Conta "1" --> "1" Cliente
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Conta ..|> IConta
```