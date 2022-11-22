import logic.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            // response for anonymous user
            // ... authorization anonymous user
            // ... registration anonymous user
            // session.setAttribute("current_user", ID
        } else {
            // response for authorized user
        }
    }

//        Cart cart = (Cart) session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int amount = Integer.parseInt(request.getParameter("amount"));
//
//        if (cart == null) {
//            cart = new Cart();
//            cart.setAmount(amount);
//            cart.setName(name);
//        }
//
//        session.setAttribute("cart", cart);
//
//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
