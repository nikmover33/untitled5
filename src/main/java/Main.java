import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        String token="ODA5ODcwNTg4OTUxNjU4NTI2.YCbYww.ZKoDZTCwsb0_yygYlxH80p3jwTw";
        JDA builder= JDABuilder.createDefault(token).setActivity(Activity.watching("Die")).build();


        builder.addEventListener(new Main());

        li();
    }
    protected static void li()
    {

    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        String z="";
        System.out.println(event.getAuthor().getName()+": "+event.getMessage().getContentDisplay());
        z=event.getMessage().getContentRaw().toString();

        switch(z)
        {
            case "Hi":

                    event.getChannel().sendMessage("Hello, my friend, i grate to see you!").queue();
                    break;
            case "Help":

                    event.getChannel().sendMessage("I'm a bot named Nikitok. I'm here to help you speanding ypu time :)").queue();
                break;
            case "Bye":

                    event.getChannel().sendMessage("Bye, good luck!").queue();
                    break;

        }
    }

}
