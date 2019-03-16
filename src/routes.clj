(ns routes
  (:require [coast]))

(def routes
  (coast/routes
    (coast/site-routes :components/layout
      [:get "/" :home/index]
      [:404 :home/not-found]
      [:500 :home/server-error])))
