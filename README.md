# ciderfig

This is a test project for trying to connect cider to figwheel.

To start up, do

```
lein figwheel
```

then in emacs

```
M-x cider-connect <Enter> 7888
```

then in the repl

```
(do (use 'figwheel-sidecar.repl-api)
    (cljs-repl))
```
