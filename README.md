# About

This meta layer is for adding a `connman` configuration file. As of now, this configuration file blacklists the `eth0`
interface. This allows the `networking` SysVInit script to properly bring up the `eth0` and apply a static IP.

### Instructions

```
> git clone <repo-url>
> git checkout -b mickledore

# setup build directory, then ... 
> bitbake-layers add-layer <layer-name>

# add following to <build-directory/conf/local.conf>
IMAGE_INSTALL:append = " connman-blacklist"
```
