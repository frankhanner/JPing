## Java Ping
### Overview
This is a simple tool that allows you to see if a remote machine is reachable
via ping as opposed to Java's included: 
```java
InetAddress.getByName(ip).isReachable(timeout);
```
I've noticed some false readings using the above Java API in some instances on
windows machines. This is intended for Windows machines only since the false 
reading occures when Port 7 is blocked; thus, ICMP isn't the default method, 
which is what "ping" uses. If on Mac or Linux, Java's API will work in all circumstances.

### Why
The main use for this tool is if you have to bootup or shutdown a network
in a particular order (example shutdown sequence: workstations then servers then 
domain controller then raids then switches). Simply ping each piece of hardware 
and decide what needs to be done accordingly.

### Use
Since the method is static, simply use the following call where `host` is a string with
the name or IP address of the machine you're trying to reach.
```java
Ping.isReachable(host);
```
If the machine is reachable, it will return true; else it will return false.

### How it works
This tool executes the ping command piped with find. It basically parses out the 
ping and looks for TTL. If TTL is present, we know the machine has been reached, else
it is not reachable.
