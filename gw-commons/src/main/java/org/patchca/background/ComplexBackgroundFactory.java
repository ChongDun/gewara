package org.patchca.background;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import org.patchca.color.ColorFactory;
import org.patchca.color.SingleColorFactory;

public class ComplexBackgroundFactory implements BackgroundFactory {
	/**
	 * �Զ�����֤��ͼƬ����,��Ҫ��һЩ���͸�����
	 */
	private Random random = new Random();
	private ColorFactory factory = new SingleColorFactory(new Color(25, 60, 170));
	public void fillBackground(BufferedImage image) {
		Graphics graphics = image.getGraphics();

		// ��֤��ͼƬ�Ŀ��
		int imgWidth = image.getWidth();
		int imgHeight = image.getHeight();
		// ���Ϊ��ɫ����
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, imgWidth, imgHeight);

		// ��100�����(��ɫ��λ�����)
		for (int i = 0; i < 10; i++) {
			// �����ɫ
			//int rInt = random.nextInt(255);
			//int gInt = random.nextInt(255);
			//int bInt = random.nextInt(255);

			graphics.setColor(factory.getColor(1));

			// ���λ��
			int xInt = random.nextInt(imgWidth - 3);
			int yInt = random.nextInt(imgHeight - 2);

			// �����ת�Ƕ�
			int sAngleInt = random.nextInt(360);
			int eAngleInt = random.nextInt(360);

			// �����С
			int wInt = random.nextInt(6);
			int hInt = random.nextInt(6);

			graphics.fillArc(xInt, yInt, wInt, hInt, sAngleInt, eAngleInt);
			// ��5��������
			if (i % 2 == 0) {
				int xInt2 = random.nextInt(imgWidth);
				int yInt2 = random.nextInt(imgHeight);
				graphics.drawLine(xInt, yInt, xInt2, yInt2);
			}
		}
	}
}
