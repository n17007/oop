class TextFileReader{
//アクセス中のファイル番号を格納する変数
private int fileNo;

//ファイルを開く
void open(String pathName){
    fileNo = 100; //ファイル開いてファイル番号取得
    System.out.println(pathName + "ファイルを開いて" + fileNo + "を取得");
}

//データの読み込み
char read() {
    System.out.println(fileNo + "からデータを読み込む");
    return 'a';
}


//ファイルを閉じる
char close() {
    System.out.println(fileNo + "ファイルを閉じた");
    return 0;
}
}
