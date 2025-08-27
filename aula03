package com.mycompany.aula03;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

// === 1. Classe do Evento ===

class MensagemEvent extends EventObject {
    private String mensagem;

    public MensagemEvent(Object source, String mensagem) {
        super(source);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

// === 2. Interface do Listener (ouvinte) ===
interface MensagemListener {
    void mensagemRecebida(MensagemEvent event);
}

// === 3. Classe que dispara os eventos ===
class Mensageiro {
    private List<MensagemListener> listeners = new ArrayList<>();

    // Adiciona ouvintes
    public void addMensagemListener(MensagemListener listener) {
        listeners.add(listener);
    }

    // Dispara evento para todos os ouvintes
    public void enviarMensagem(String mensagem) {
        MensagemEvent event = new MensagemEvent(this, mensagem);
        for (MensagemListener listener : listeners) {
            listener.mensagemRecebida(event);
        }
    }
}

// === 4. Programa principal ===
public class Aula03 {
    public static void main(String[] args) {
        Mensageiro mensageiro = new Mensageiro();

        // Adicionando um ouvinte
        mensageiro.addMensagemListener(new MensagemListener() {
            @Override
            public void mensagemRecebida(MensagemEvent event) {
                System.out.println("Ouvinte 1 recebeu: " + event.getMensagem());
            }
        });

        // Adicionando outro ouvinte
        mensageiro.addMensagemListener(event ->
                System.out.println("Ouvinte 2 recebeu (lambda): " + event.getMensagem())
        );

        // Disparando eventos
        mensageiro.enviarMensagem("Olá, mundo!");
        mensageiro.enviarMensagem("Evento personalizado funcionando!");
    }
}

Esse código mostra como funciona o tratamento de eventos personalizados em Java:

Criamos um evento (MensagemEvent),

Criamos ouvintes (MensagemListener),

Um disparador (Mensageiro),

E testamos disparando mensagens que todos os ouvintes recebem.







Exemplo 2


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula_03;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

public class Aula_03 extends JFrame {

    // === Evento personalizado ===
    static class ConsumoEvent extends EventObject {
        private double consumo;

        public ConsumoEvent(Object source, double consumo) {
            super(source);
            this.consumo = consumo;
        }

        public double getConsumo() {
            return consumo;
        }
    }

    // === Listener (ouvinte) ===
    interface ConsumoListener {
        void consumoExcedido(ConsumoEvent event);
    }

    // === Classe disparadora (Medidor) ===
    static class MedidorEnergia {
        private double limite;
        private List<ConsumoListener> listeners = new ArrayList<>();

        public MedidorEnergia(double limite) {
            this.limite = limite;
        }

        public void addConsumoListener(ConsumoListener listener) {
            listeners.add(listener);
        }

        // Simula a leitura de consumo
        public void registrarConsumo(double valor) {
            System.out.println("Consumo registrado: " + valor + " kWh");
            if (valor > limite) {
                ConsumoEvent event = new ConsumoEvent(this, valor);
                for (ConsumoListener listener : listeners) {
                    listener.consumoExcedido(event);
                }
            }
        }
    }

    // === Interface gráfica ===
    private JTextField campoConsumo;
    private JTextArea areaLog;
    private MedidorEnergia medidor;

    public Aula_03() {
        super("Monitor de Energia - Eventos Personalizados");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl = new JLabel("Digite consumo (kWh):");
        lbl.setBounds(20, 20, 200, 25);
        add(lbl);

        campoConsumo = new JTextField();
        campoConsumo.setBounds(200, 20, 100, 25);
        add(campoConsumo);

        JButton btnRegistrar = new JButton("Registrar Consumo");
        btnRegistrar.setBounds(310, 20, 160, 25);
        add(btnRegistrar);

        areaLog = new JTextArea();
        JScrollPane scroll = new JScrollPane(areaLog);
        scroll.setBounds(20, 60, 450, 180);
        add(scroll);

        // Cria o medidor com limite de 100 kWh
        medidor = new MedidorEnergia(150.0);

        // Ouvinte 1: alerta
        medidor.addConsumoListener(event ->
            areaLog.append("ALERTA: Consumo excedido! (" + event.getConsumo() + " kWh)\n")
        );

        // Ouvinte 2: banco de dados simulado
        medidor.addConsumoListener(event ->
            areaLog.append("Banco de Dados: Registro salvo para " + event.getConsumo() + " kWh.\n")
        );

        // Ouvinte 3: relatório
        medidor.addConsumoListener(event ->
            areaLog.append("Relatório: Consumo acima do limite registrado.\n")
        );

        // Ação do botão
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(campoConsumo.getText());
                    medidor.registrarConsumo(valor);
                    areaLog.append("Consumo registrado: " + valor + " kWh\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digite um valor numérico válido.");
                }
                campoConsumo.setText("");
            }
        });
    }

    // === Programa principal ===
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Aula_03().setVisible(true);
        });
    }
}


O que acontece

Você digita o valor do consumo no campo.

Clica no botão Registrar Consumo.

Se o valor passar do limite (100 kWh), os 3 ouvintes são notificados e escrevem mensagens na área de log.

Se não passar do limite, apenas aparece o consumo registrado.
