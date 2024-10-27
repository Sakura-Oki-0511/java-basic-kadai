package kadai_015;

public class Car_Chapter15 {
	// フィールド
	private int gear = 1; // 1速から5速のギアを表す初期値
	private int speed = 10; // ギアチェンジ後の速度を表す初期値

	// ギアの変更メソッド
	public void gearChange(int afterGear) {
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear; // ギアを変更

			// ギアに応じた速度を設定
			switch (afterGear) {
			case 1:
				speed = 10; // 1速の速度
				break;
			case 2:
				speed = 20; // 2速の速度
				break;
			case 3:
				speed = 30; // 3速の速度
				break;
			case 4:
				speed = 40; // 4速の速度
				break;
			case 5:
				speed = 50; // 5速の速度
				break;
			}
			System.out.println("速度は時速" + speed + "kmです");
		}
	}

