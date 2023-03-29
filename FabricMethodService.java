package Task2;

public class FabricMethodService {
    public final static int WEB= 1;
    private static final int MOB = 2;

    public void exec() throws Exception {
        Configuration configuration = Configuration.initWeb();
        Dialog dialog;
        switch(configuration.getPlatform()) {
            case (WEB):
                dialog = new WebDialog();
                break;
            case (MOB):
                dialog = new MobDialog();
                break;
            default:
                throw new Exception("Неизвестный тип платформы");
        }
        dialog.render();
    }

}

