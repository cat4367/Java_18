package training.test20260918;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OmokGUI extends JFrame {
    private static final int BOARD_SIZE = 15; // 15x15 오목판
    private static final int CELL_SIZE = 40;  // 칸 하나의 크기 (픽셀)
    private static final int MARGIN = 50;     // 여백 (픽셀)
    private static final int STONE_SIZE = 34; // 돌의 크기 (픽셀)

    // 0: 빈칸, 1: 흑돌, 2: 백돌
    private int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
    private boolean isBlackTurn = true; // true: 흑돌, false: 백돌

    public OmokGUI() {
        setTitle("자바 마우스 오목");
        // 창 크기 설정 (바둑판 + 여백 고려)
        setSize(MARGIN * 2 + CELL_SIZE * (BOARD_SIZE - 1), 
                MARGIN * 2 + CELL_SIZE * (BOARD_SIZE - 1) + 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null); // 화면 중앙에 배치

        // 바둑판 역할을 할 커스텀 패널 생성 및 추가
        BoardPanel boardPanel = new BoardPanel();
        add(boardPanel);

        // 마우스 클릭 이벤트 등록
        boardPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 1. 마우스 클릭 좌표 (X, Y) 가져오기
                int x = e.getX();
                int y = e.getY();

                // 2. 화면 좌표를 배열의 행(row), 열(col) 인덱스로 변환
                // Math.round를 사용해 선 교차점에 가깝게 클릭하도록 처리
                int col = Math.round((float) (x - MARGIN) / CELL_SIZE);
                int row = Math.round((float) (y - MARGIN) / CELL_SIZE);

                // 3. 바둑판 범위 내에 있고, 빈 공간인지 확인
                if (row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE) {
                    if (board[row][col] == 0) {
                        // 현재 턴에 맞는 돌 착수 (1: 흑돌, 2: 백돌)
                        board[row][col] = isBlackTurn ? 1 : 2;
                        
                        // 턴 교체 (논리값 토글)
                        isBlackTurn = !isBlackTurn;

                        // 화면 다시 그리기 요청
                        repaint();
                    }
                }
            }
        });
    }

    // 바둑판 및 돌을 그리는 커스텀 패널 클래스
    private class BoardPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // 안티앨리어싱 설정 (선과 원을 부드럽게 출력)
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // 배경색 지정 (나무판 느낌)
            setBackground(new Color(220, 179, 92));

            // 1. 격자선 그리기
            g2.setColor(Color.BLACK);
            for (int i = 0; i < BOARD_SIZE; i++) {
                // 가로선
                g2.drawLine(MARGIN, MARGIN + i * CELL_SIZE, 
                            MARGIN + (BOARD_SIZE - 1) * CELL_SIZE, MARGIN + i * CELL_SIZE);
                // 세로선
                g2.drawLine(MARGIN + i * CELL_SIZE, MARGIN, 
                            MARGIN + i * CELL_SIZE, MARGIN + (BOARD_SIZE - 1) * CELL_SIZE);
            }

            // 2. 2차원 배열 상태에 맞춰 돌 그리기
            for (int r = 0; r < BOARD_SIZE; r++) {
                for (int c = 0; c < BOARD_SIZE; c++) {
                    if (board[r][c] != 0) {
                        // 돌이 위치할 중심 좌표 계산
                        int x = MARGIN + c * CELL_SIZE - STONE_SIZE / 2;
                        int y = MARGIN + r * CELL_SIZE - STONE_SIZE / 2;

                        if (board[r][c] == 1) { // 흑돌
                            g2.setColor(Color.BLACK);
                            g2.fillOval(x, y, STONE_SIZE, STONE_SIZE);
                        } else if (board[r][c] == 2) { // 백돌
                            g2.setColor(Color.WHITE);
                            g2.fillOval(x, y, STONE_SIZE, STONE_SIZE);
                            // 백돌 테두리 추가
                            g2.setColor(Color.BLACK);
                            g2.drawOval(x, y, STONE_SIZE, STONE_SIZE);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Swing GUI는 Event Dispatch Thread에서 실행하는 것이 정석
        SwingUtilities.invokeLater(() -> {
            new OmokGUI().setVisible(true);
        });
    }
}