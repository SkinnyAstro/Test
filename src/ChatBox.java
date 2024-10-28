import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBox {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Chat Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create the chat area
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);  // Chat area should not be editable by the user
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        // Add a scroll pane to the chat area
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Create the text field for user input
        JTextField chatInput = new JTextField();

        // Create the send button
        JButton sendButton = new JButton("Send");

        // Panel for input and button
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(chatInput, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        // Add the components to the frame
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(inputPanel, BorderLayout.SOUTH);

        // ActionListener for the send button and Enter key in the text field
        ActionListener sendAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userText = chatInput.getText().trim();
                if (!userText.isEmpty()) {
                    chatArea.append("You: " + userText + "\n");
                    chatInput.setText("");
                    // Here you could add logic to send the text to a server or another user
                }
            }
        };

        sendButton.addActionListener(sendAction);
        chatInput.addActionListener(sendAction); // Allows pressing Enter to send the message

        // Display the frame
        frame.setVisible(true);
    }
}
