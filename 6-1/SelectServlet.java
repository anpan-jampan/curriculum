

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectServlet extends HttpServlet {
	//質問①：お作法としてシリアライズは必要な認識でした。
	//シリアライズは具体的にどういった場面でその機能を発揮するのでしょうか？
	//メンテナンス等のサーバー再起動時にデータの整合性を保っておける？
	//などの情報を見かけますが今一つイメージがつかないです。
	private static final long serialVersionUID = 1L;

	//デフォルトコンストラクタは暗黙的に実行されるため明示的な記述の必要なし
//    public SelectServlet() {
//        super();
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	 public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
	        request.setCharacterEncoding("UTF-8");
	        // 問① select.htmlから渡された値を受け取るために下記を修正しましょう。
	        String value = request.getParameter("month");
	        response.setContentType("text/html; charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        // 問② エビデンスと同じ表示になるように修正しましょう。
	        out.println("今は" + value  +  "月です。");
	    }

}
