public abstract class Host {

    protected int[] ipAddress = {192,168,0,1};
    protected String[] macAddress = {"MAC","1bF5","AAFE","123D"};

    public int[] getIpAddress() {return ipAddress;}
    public String[] getMacAddress() {return macAddress;}

    public boolean isIp() {

        if (ipAddress.length < 0)
            return false;

        return true;

    }

    public boolean isMac() {

        if (macAddress.length < 0)
            return false;

        return true;

    }

    @Override
    public String toString() {

        int regex = 0;
        String strIP = "";
        for (int ip : ipAddress) {

            if (regex == 3) {

                strIP += ip+"\n";
                break;

            }

            strIP += ip+".";
            regex++;

        }

        regex = 0;
        String strMAC = "";
        for (String mac : macAddress) {

            if (regex == 3) {

                strMAC += mac+"\n";
                break;

            }

            strMAC += mac+"-";
            regex++;

        }

        return String.format("IP: %s\nMAC: %s\n",strIP,strMAC);

    }

}
