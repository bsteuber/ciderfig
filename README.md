# ciderfig

This is a test project for trying to connect cider to figwheel.

It currently fails on my machine.

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

Once the repl started, navigate to src/cljs/ciderfig/core.cljs and press

```
C-c C-k
```

You will get an error

```
Exception updating the ns-cache #error {
 :cause No method in multimethod 'ns-as-map' for dispatch value: null
 ```

Any ideas?
