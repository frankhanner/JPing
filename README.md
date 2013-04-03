## Java ping

### Overview
This is a simple tool that allows you to see if a remote machine is reachable
via ping as opposed to Java's included InetAddress.getByName(ip).isReachable(timeout).
I've noticed some false readings using the included Java API. This works on
both Windows, Mac, and Linux.