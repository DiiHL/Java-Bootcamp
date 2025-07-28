# Projeto de Fila de Emails com Threads

Este é um projeto simples em Java que simula uma fila de emails utilizando `Queue` e controle de concorrência com `wait` e `notify`.

A classe `Members` permite adicionar e retirar emails de forma segura entre múltiplas threads, simulando um fluxo de produção e consumo.

## Funcionalidades

- Adição de emails à fila com sincronização
- Retirada de emails com espera ativa (`wait`)
- Finalização controlada da fila (`open = false`)
- Comunicação entre threads com `notifyAll`
