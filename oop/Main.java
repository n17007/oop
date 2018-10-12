public class Main {
    public static void main(String [] args) {
    //start
    //System.out.println("Hello world!!");
    //TextFileReaderのインスタンスを作る
    TextFileReader rd1 = new TextFileReader();

    //ファイルを開く
    rd1.open("/var/tmp/date.dat");
    //System.out.println("ファイル番号:" +rd1.fileNo); バグ

    //rd1.fileNo = 200; バグ

    //データを読み込む
    char date =rd1.read();

    //データを処理する
    System.out.println(date + "を処理");

    //結果を出力
    System.out.println("結果を出力");

    //ファイルを閉じる
    rd1.close();
    }
}
