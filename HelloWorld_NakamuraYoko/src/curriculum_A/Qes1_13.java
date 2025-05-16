package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		
		
		/********************************************************
		 問1.ローカル変数として宣言
		 ********************************************************/
		
		
		//バイト型のローカル変数を宣言
		byte myByte; // 変数myByteを宣言
		
		//短整数型のローカル変数を宣言
		short myShort; // 変数myShortを宣言
		
		//整数型のローカル変数を宣言
		int myInt; // 変数myIntを宣言
		
		//長整数型のローカル変数を宣言
		long myLong; // 変数myLongを宣言
		
		//単精度浮動小数点数型を宣言
		float myFloat; // 変数myFloatを宣言
		
		//倍精度浮動小数点数型を宣言
		double myDouble; // 変数myDoubleを宣言
		
		//文字型をローカル変数として宣言
		char myChar; // 変数myCharを宣言
		
		//文字列型をローカル変数として宣言
		String myString; // 変数myStringを宣言
		
		//ブーリアン型をローカル変数として宣言
		boolean isActive; // 変数booleanを宣言
		
		
		
		/********************************************************
		 問2.ローカル変数をローカル内で初期値を代入し初期化
		 ********************************************************/
		
		
		//バイト型のローカル変数に初期値を代入し初期化
		myByte = 0; // 初期値0で初期化
		
		//短整数型のローカル変数に初期値を代入し初期化
		myShort = 0; // 初期値0で初期化
		
		//整数型のローカル変数に初期値を代入し初期化
		myInt = 0; // 初期値0で初期化
		
		//長整数型のローカル変数に初期値を代入し初期化
		myLong = 0L; // 初期値0Lで初期化
		
		//単精度浮動小数点数型のローカル変数に初期値を代入し初期化
		myFloat = 0.0f; // 初期値0.0fで初期化
		
		//倍精度浮動小数点数型のローカル変数に初期値を代入し初期化
		myDouble = 0.0d; // 初期値0.0dで初期化
		
		//文字型のローカル変数に初期値を代入し初期化
		myChar = '\u0000'; // 初期値'\u0000'で初期化
		
		//文字列型のローカル変数に初期値を代入し初期化
		myString = null; // 初期値nullで初期化
		
		//ブーリアン型のローカル変数に初期値を代入し初期化
		boolean isFinished = false; // 初期値falseで初期化
		
		
		
		/********************************************************
		 問3.初期化をしたそれぞれの変数に次の値を代入
		 ********************************************************/
		
		
		//初期化したバイト型のローカル変数に値を代入
		myByte = 10; // 10を代入
		
		//初期化した短整数型のローカル変数に値を代入
		myShort = 100; // 100を代入
		
		//整数型のローカル変数に値を代入
		myInt = 1000; // 1000を代入
		
		//長整数型のローカル変数に値を代入
		myLong = 10000; // 10000を代入
		
		//単精度浮動小数点数型のローカル変数に値を代入
		myFloat = 9.5f; // 9.5を代入
		
		//倍精度浮動小数点数型のローカル変数に値を代入
		myDouble = 10.5d; // 10.5を代入
		
		//文字型のローカル変数に値を代入
		myChar = 'a'; // aを代入
		
		//文字列型のローカル変数に値を代入
		myString = "ハロー"; // ハローを代入
		
		//ブーリアン型のローカル変数に値を代入
		isActive = true; // trueを代入
		
		
		
		/********************************************************
		 問4.上記で作成した変数を使用して、
		 下記の通りにコンソール出力されるようにしてください
		 
		 
		 11110
		 20
		 a ハロー true
		 11130
		 10000000000
		 0.105
		 -90
		 
		 
		 ********************************************************/
		
		
		//コンソールに文字列を出力
		System.out.println(myLong + myInt + myShort + myByte); // 11110と出力
		
		System.out.println(myLong / myInt + myShort / myByte); // 20と出力
		
		System.out.println(myChar + " " + myString + " " + isActive); // a ハロー　true
		
		System.out.println(myLong + myInt + myShort + myByte + myLong / myInt + myShort / myByte ); // 11130と出力
		
		System.out.println(myLong * myInt * myShort * myByte); // 10000000000と出力
		
		System.out.println(myDouble / myShort); // 0.105と出力
		
		System.out.println(myByte - myShort); // -90と出力
		
		
		
		/********************************************************
		 問5.下記を、「ハローJAVA2023」という結果が表示されるのを、「ハローJAVA43」と表示させるように修正してください。
		 
		 String num="20";
		 int num1=23;
		 System.out.println("ハローJAVA"+(num+num1));
		 
		 ********************************************************/
		
		
		// コンソールに文字列を出力
		
		String num = "20";
		
		int num1 = 23;
		
		// numを整数に変換して足し算する
		
		System.out.println("ハローJAVA"+ (Integer.parseInt(num)+num1));
		
		
		
		/********************************************************
		 問6.『山田太郎 18歳 170.5cm 62.2kg 寿司』の人の情報を
		 変数にして、formatの通り出力してください。
		 
		 ↓↓format↓↓
		 「初めまして○○です」
		 「年齢は○○歳です」
		 「身長は○○cmです」
		 「体重は○○kgです」
		 「好きな食べ物は○○です」
		 
		 ******************************************************/
		
		/*
		 *変数宣言する処理
		 */
		
		String name = "山田太郎"; // 名前は山田太郎
		
		int age = 18; // 年齢は18歳
		
		double heightCm = 170.5; // 身長は170.5cm
		
		double weight = 62.2; // 体重は62.2kg
		
		String favoritefood = "寿司"; // 好きな食べ物は寿司
		
		
		/*
		 *自己紹介文を出力する処理
		 */
		
		
		System.out.println("「初めまして" + name + "です」");
		
		System.out.println("「年齢は" + age + "歳です」");
		
		System.out.println("「身長は" + heightCm + "cmです」");
		
		System.out.println("「体重は" + weight + "kgです」");
		
		System.out.println("「好きな食べ物は" + favoritefood + "です」");
		
		
		/********************************************************
		 問7. 問6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 
		 「BMIは○○です」
		 
		 *******************************************************/
		
		
		/*
		 *BMIを宣言する処理
	     */
		
		
	    double height = heightCm / 100.0; // cm(センチ)からM(メートル)に変換	
	    
	    double bmi = weight / (height * height); // BMIを計算
		
	    
	    /*
		 *BMIを出力する処理
		 */
		
	    
	    System.out.println("「BMIは" + String.format ("%.1f", bmi) + "です」");
	    
	    System.out.println("「BMIは" + bmi + "です」");
	    
	    System.out.println("「BMIは" + String.format ("%.3f", bmi) + "です」");
	    
	    /*********************************************************
	     問8. 問6で宣言した変数に再代入し下記の通りコンソールに出力してください"
	    
	     初めまして鈴木一郎です
	     年齢は24歳です
	     身長168.5cmです
	     体重は64.2kgです
	     好きな食べ物はオムライスです
	     BMIは22.6です
         
	     *******************************************************/
	    
	    /*
	     *下記の変数を再代入
	     */
	    
	    name = "鈴木一郎"; // 名前を鈴木一郎に変更
	    
	    age = 24; // 年齢を24歳に変更
	    
	    heightCm = 168.5; // 身長を168.5cmに変更
	    
	    weight = 64.2; // 64.2kgに変更
	    
	    favoritefood = "オムライス"; // 好きな食べ物をオムライスに変更
	   
	    height = heightCm / 100.0; // cm(センチ)からM(メートル)に変換
	    
	    bmi = weight / (height * height); // BMIを計算
	    
	    
	    /*
	     *自己紹介文を上記の変数を再代入して出力する処理
	     */
	    
	    
	    
	    System.out.println("「初めまして" + name + "です」");
	    
	    System.out.println("「年齢は" + age + "歳です」");
	    
	    System.out.println("「身長は" + heightCm + "cmです」");
	    
	    System.out.println("「体重は" + weight + "kgです」");
	    
	    System.out.println("「好きな食べ物は" + favoritefood + "です」");
	    
	    System.out.println("「BMIは" + String.format ("%.1f", bmi) + "です」");
	    
	    
	    
	    /*********************************************************
	     問9. 問8で使用した変数【年齢・身長・体重】の数値を和算で
	          自己代入し、下記の通りコンソールに出力してください
	    
	    初めまして鈴木一郎です
	    年齢は48歳です
	    身長337.0cmです
	    体重は128.4kgです
	    好きな食べ物はオムライスです
	    BMIは11.31です
	    
	    *******************************************************/
	    
	    
	    /*
	     * 和算を使用して、数値を自己代入で変更
	     */
	    
	    
	    age += 24; // age = age + 24; → 年齢を24歳加算 → 48歳
	    
	    heightCm += 168.5; // heightCm = heightCm + 168.5; →身長を168.5cm加算 →337.0cm
	    
	    weight += 64.2; // weight = weight + 64.2; → 体重を64.2kg加算 → 128.4kg
	    
	    height = heightCm / 100.0; // cm(センチ)からM(メートル)に変換
	    
	    bmi = weight / (height * height); // BMIを計算
	    
	    
	    
	    /*
	     * 和算を使用して、数値を自己代入でした数値で、自己紹介文を出力する
	     */
	    
	    
	    System.out.println("「初めまして" + name + "です」");
	    
	    System.out.println("「年齢は" + age + "歳です」");
	    
	    System.out.println("「身長は" + heightCm + "cmです」");
	    
	    System.out.println("「体重は" + weight + "kgです」");
	    
	    System.out.println("「好きな食べ物は" + favoritefood + "です」");
	    
	    System.out.println("「BMIは" + String.format ("%.2f", bmi) + "です」");
	    
	    
	    
	    /*********************************************************
	    問10.問8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。
	    *******************************************************/
	    
	    
	    boolean b = (age >= 25 ); // 年齢が25歳以上
	    
	    /*
	     * 25歳以上ならtrueと出力する
	     */
	    
	    
	    System.out.println("年齢が25歳以上なら" + b ); //25歳以上ならtrueと出力する
	    
	    
	    /*********************************************************
	     問11.問8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください。
	     *******************************************************/
	    
	    
	    age = 24; // 年齢を24歳に変更
	    
	    heightCm = 168.5; // 身長を168.5cmに変更
	    
	    weight = 64.2; // 64.2kgに変更
	    
	    
	    /*
	     * 【年齢・身長・体重】を文字列型に型変換する処理
	     */
	    
	    
	    String ageStr = String.format("%d", age); // 年齢を文字列型に型変換
	    
        String heightStr = String.format("%.1f", heightCm); // 身長を文字列型に型変換
        
        String weightStr = String.format("%.1f", weight); // 体重を文字列型に型変換
	    
        /*
	     * 【年齢・身長・体重】を文字列型に型変換して出力する
	     */
        
        System.out.println(ageStr);
       
        System.out.println(heightStr);
        
        System.out.println(weightStr);
        
        System.out.println(ageStr+"歳"+heightStr+"cm"+weightStr+"kg");
	    
        
        
        /*********************************************************
	     問12.問11で変換した【年齢・身長】を整数型に変換して出力してください
	     *******************************************************/
	    
	    
	    /*
	     * 【年齢・身長】をDouble型に型変換する処理
	     */
	    
        double ageDouble = Double.parseDouble(ageStr); // 年齢をDouble型に型変換
        
        double heightDouble = Double.parseDouble(heightStr); // 身長をDouble型に型変換
        
        
        
        /*
	     * 【年齢・身長】をDouble型をInt型に変換する処理
         */
        
        int ageInt = (int) ageDouble; // 年齢をdouble型からInt型に型変換
        
        int heightInt = (int) heightDouble; // 身長をdouble型からInt型に型変換
        
        
        /*
	     * 【年齢・身長】を整数型に型変換して出力
	     */
        
        System.out.printf("%d%n",ageInt);
        
        System.out.printf("%d%n",heightInt);
        
        
        /*********************************************************
         問13.問12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
 	     *******************************************************/
         
         
         
         boolean result = (ageInt >= 25) || (heightInt >= 160);
         
         
        /*
         *【年齢が25もしくは身長が160以上】であればtrueを出力
         */
         
         
        System.out.println(result);
        
        
	}}










