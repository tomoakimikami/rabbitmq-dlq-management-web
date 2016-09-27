package rabbitmq.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * トップページリクエスト用コントローラ.
 *
 * @author Tomoaki Mikami
 */
@Controller
public class IndexController {
  /**
   * トップページリクエストハンドラ.
   *
   * @param attributes リダイレクト属性
   * @return リダイレクトページ用識別子
   */
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(RedirectAttributes attributes) {
    // DLQキュー一覧へリダイレクトします.
    return "redirect:/deadLetterQueues";
  }
}
