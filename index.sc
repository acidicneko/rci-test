start test

print Installing i3 config
i3/config=$HOME/test/i3/config
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

exec /bin/echo $HOME $RCI

stop test
