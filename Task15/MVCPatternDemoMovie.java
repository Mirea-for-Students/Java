package Task15;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.IOException;

public class MVCPatternDemoMovie {
    public static void main(String[] args) throws IOException, InterruptedException {
        Movie model = new Movie("Дата показа 12.12.2023", "Когда речь идет о деньгах, совесть молчит. А уж если речь об огромных деньгах!.. Это основанная на реальных событиях история нескольких провидцев, которые независимо друг от друга предсказали мировой экономический кризис 2008 года задолго до того, как о нем зашептались в кулуарах на Уолл-стрит. И предсказав, стали на нем зарабатывать. Сами того не желая.");
        MovieView view = new MovieView();
        MovieController controller = new MovieController(model, view);
        controller.updet("D:\\IdeaProjects\\untitled\\src\\Task15\\2.jpg", model.getOpis(), model.getDate());
        view.addMouseListener(new MouseAdapter() {
            int click = 1;

            @Override
            public void mouseClicked(MouseEvent e) {
                switch (click) {
                    case 0:
                        controller.updet("D:\\IdeaProjects\\untitled\\src\\Task15\\2.jpg", "Дата показа 13.12.2023", "Когда речь идет о деньгах, совесть молчит. А уж если речь об огромных деньгах!.. Это основанная на реальных событиях история нескольких провидцев, которые независимо друг от друга предсказали мировой экономический кризис 2008 года задолго до того, как о нем зашептались в кулуарах на Уолл-стрит. И предсказав, стали на нем зарабатывать. Сами того не желая.");
                        break;
                    case 1:
                        controller.updet("D:\\IdeaProjects\\untitled\\src\\Task15\\3.jpg", "Дата показа 14.12.2023", "Нью-йоркский финансист Джордан Белфорт в конце 80-х годов основал одну из крупнейших брокерских компаний, но через десять лет его осудили за мошенничество с ценными бумагами. С самых высот финансового мира Белфорду приходиться опуститься на самое дно, он борется с алкоголизмом и наркотической зависимостью, но после тюремного заключения бывший брокер переосмысливает свою жизнь, начинает читать лекции и выпускает книгу.");
                        break;
                    case 2:
                        controller.updet("D:\\IdeaProjects\\untitled\\src\\Task15\\4.jpg", "Дата показа 15.12.2023","Американское семейство отправляется из Чикаго в Европу, но в спешке сборов бестолковые родители забывают дома… одного из своих детей. Юное создание, однако, не теряется и демонстрирует чудеса изобретательности. И когда в дом залезают грабители, им приходится не раз пожалеть о встрече с милым крошкой.");
                        break;
                    case 3:
                        controller.updet("D:\\IdeaProjects\\untitled\\src\\Task15\\5.jpg", "Дата показа 16.12.2023", "Кобб — талантливый вор, лучший из лучших в опасном искусстве извлечения: он крадет ценные секреты из глубин подсознания во время сна, когда человеческий разум наиболее уязвим. Редкие способности Кобба сделали его ценным игроком в привычном к предательству мире промышленного шпионажа, но они же превратили его в извечного беглеца и лишили всего, что он когда-либо любил.");
                        break;
                    case 4:
                        controller.updet("D:\\IdeaProjects\\untitled\\src\\Task15\\1.png", "Дата показа 17.12.2023", "Вскоре после отмщения за смерть жены и сына, Макс Рокатански покинул ряды «Основного силового патруля» и уехал в глушь, где скитается в одиночестве, пока мир медленно падает впоследствии нефтяного кризиса и глобальной войны. Не имея ничего, кроме своей машины «Перехватчик», Максу предстоит научиться, как выжить в пост-апокалиптической пустоши и сражаться с жестокими, безжалостными воинами, которые населяют её.");
                        break;
                }
                click++;
                if (click == 5) {
                    click = 0;
                }
            }
        });
    }
}
