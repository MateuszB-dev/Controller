import java.util.Scanner;

public class Controller {

        Buttons button = new Buttons();
        Scanner scanner = new Scanner(System.in);
        String useranswer;
        boolean b = true;
        boolean c = true;

    public void start() {
            System.out.print("Aktualnie TV jest "); button.isOnOff();
            while (b) {
                System.out.println("Jeśli chcesz włączyć TV naciśnij 1, jeśli chcesz zakończyć działanie programu naciśnij 2.");
                useranswer = scanner.next();
                if (useranswer.equalsIgnoreCase("1")) {
                    b = false;
                    while (c) {
                        System.out.println("Wybierz operacje jaką chcesz wykonać:");
                        button.showButtons();
                        System.out.println();
                        useranswer = scanner.next();
                        if (useranswer.equalsIgnoreCase("Kanal1") || useranswer.equalsIgnoreCase("Kanał1")) {
                            button.setChannel(1);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("Kanal2") || useranswer.equalsIgnoreCase("Kanał2")) {
                            button.setChannel(2);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("Kanal4") || useranswer.equalsIgnoreCase("Kanał4")) {
                            button.setChannel(4);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("Kanal5") || useranswer.equalsIgnoreCase("Kanał5")) {
                            button.setChannel(5);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("Kanal6") || useranswer.equalsIgnoreCase("Kanał6")) {
                            button.setChannel(6);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("Kanal7") || useranswer.equalsIgnoreCase("Kanał7")) {
                            button.setChannel(7);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("Kanal8") || useranswer.equalsIgnoreCase("Kanał8")) {
                            button.setChannel(8);
                            System.out.println("Obecny kanał to: " + button.getChannel());;
                        } else if (useranswer.equalsIgnoreCase("Kanal9") || useranswer.equalsIgnoreCase("Kanał9")) {
                            button.setChannel(9);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("Kanal3") || useranswer.equalsIgnoreCase("Kanał3")) {
                            button.setChannel(3);
                            System.out.println("Obecny kanał to: " + button.getChannel());
                        } else if (useranswer.equalsIgnoreCase("channelUp")) {
                            if(button.getChannel()<9) {
                                button.setChannelUp();
                                System.out.println("Obecny kanał to: " + button.getChannel());
                            }else if(button.getChannel()==9) {
                                button.setChannel(1);
                                System.out.println("Obecny kanał to: " + button.getChannel());
                            }
                        } else if (useranswer.equalsIgnoreCase("channelDown")) {
                            if(button.getChannel()>=2) {
                                button.setChannelDown();
                                System.out.println("Obecny kanał to: " + button.getChannel());
                            }else if(button.getChannel()<2) {
                                button.setChannel(9);
                                System.out.println("Obecny kanał to: " + button.getChannel());
                            }
                        } else if (useranswer.equalsIgnoreCase("VolumeUp")) {
                            button.setVolumeUp();
                            System.out.println("Obecna głośność to: " + button.getVolume());
                        } else if (useranswer.equalsIgnoreCase("VolumeDown")) {
                            button.setVolumeDown();
                            System.out.println("Obecna głośność to: " + button.getVolume());
                        } else if (useranswer.equalsIgnoreCase("Off")) {
                            button.setOnOff(false);
                            System.out.print("TV został "); button.isOnOff();
                            c = false;
                        } else if (useranswer.equalsIgnoreCase("On")) {
                            System.out.println("Telewizor jest już włączony.");
                        } else
                            System.out.println("Nie rozumiem polecenia.");
                    }

                } else if (useranswer.equalsIgnoreCase("2")) {
                    System.out.print("Program został zakończony.");
                    b = false;
                } else
                    System.out.println("TV jest aktualnie wyłączony. Jeśli chcesz wykonać jakąś operację, włącz telewizor " +
                            "poprzez naciśnięcie odpowiedniego guzika.");
            }
        }





    }

