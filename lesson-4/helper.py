pkgs = '''Depends: fonts-liberation but it is not installable
                        Depends: libappindicator3-1 but it is not installable
                        Depends: libasound2 (>= 1.0.16) but it is not installable
                        Depends: libatk-bridge2.0-0 (>= 2.5.3) but it is not installable
                        Depends: libatk1.0-0 (>= 2.2.0) but it is not installable
                        Depends: libatspi2.0-0 (>= 2.9.90) but it is not installable
                        Depends: libcups2 (>= 1.4.0) but it is not installable
                        Depends: libdbus-1-3 (>= 1.5.12) but it is not installable
                        Depends: libdrm2 (>= 2.4.38) but it is not installable
                        Depends: libgbm1 (>= 8.1~0) but it is not installable
                        Depends: libgtk-3-0 (>= 3.9.10) but it is not installable
                        Depends: libnspr4 (>= 2:4.9-2~) but it is not installable
                        Depends: libnss3 (>= 2:3.22) but it is not installable
                        Depends: libx11-xcb1 but it is not installable
                        Depends: libxcb-dri3-0 but it is not installable
                        Depends: libxcomposite1 (>= 1:0.3-1) but it is not installable
                        Depends: libxcursor1 (> 1.1.2) but it is not installable
                        Depends: libxdamage1 (>= 1:1.1) but it is not installable
                        Depends: libxfixes3 (>= 1:5.0) but it is not installable
                        Depends: libxi6 (>= 2:1.2.99.4) but it is not installable
                        Depends: libxrandr2 (>= 2:1.2.99.3) but it is not installable
                        Depends: libxtst6 but it is not installable
                        Depends: xdg-utils (>= 1.0.2) but it is not installable
                        Recommends: libu2f-udev but it is not installable
                        Recommends: libvulkan1 but it is not installable'''

fonts = '''fonts-dejavu-core fonts-freefont-ttf fonts-guru-extra
                       fonts-kacst fonts-kacst-one fonts-khmeros-core fonts-lao
                       fonts-liberation fonts-lklug-sinhala fonts-lohit-guru
                       fonts-nanum fonts-opensymbol fonts-sil-abyssinica
                       fonts-sil-padauk fonts-symbola fonts-takao-pgothic
                       fonts-tibetan-machine fonts-tlwg-garuda-ttf
                       fonts-tlwg-kinnari-ttf fonts-tlwg-laksaman-ttf
                       fonts-tlwg-loma-ttf fonts-tlwg-mono-ttf
                       fonts-tlwg-norasi-ttf fonts-tlwg-purisa-ttf
                       fonts-tlwg-sawasdee-ttf fonts-tlwg-typewriter-ttf
                       fonts-tlwg-typist-ttf fonts-tlwg-typo-ttf
                       fonts-tlwg-umpush-ttf fonts-tlwg-waree-ttf
                       ttf-bitstream-vera ttf-dejavu-core
                       fonts-arphic-ukai fonts-arphic-uming
                       fonts-ipafont-mincho fonts-ipafont-gothic
                       fonts-unfonts-core fonts-wqy-zenhei fonts-thai-tlwg
                       '''
def go():
  for line in pkgs.splitlines():
    print(line.strip().split()[1])

def goFonts():
  for line in fonts.splitlines():
    for font in line.strip().split():
      print(font)

# go()
goFonts()
