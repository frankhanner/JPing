## Java ping

### Overview
This is a simple tool that allows you to see if a remote machine is reachable
via ping as opposed to Java's included InetAddress.getByName(ip).isReachable(timeout).
I've noticed some false readings using the included Java API. This is intended
for Windows machines only since the false reading occures when Port 7 is
blocked; thus, ICMP isn't the default method.