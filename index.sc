print Installing i3 config
i3/config=$HOME/test/i3/config
endl
print Caching fonts
exec fc-cache -fv
endl
print Installing lolrc
lolrc=$HOME/test/lol/lolrc
endl
print Priting pacman version
exec pacman --version
endl
exec echo This statement is printed via echo binary
endl
print Git Test Ended
