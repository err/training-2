(ns app.core
  (:require
    app.mutations
    [untangled.client.core :as uc]
    [untangled.i18n :refer-macros [tr trf]]
    [untangled.client.data-fetch :as df]
    [om.next :as om]))

(def initial-state {:ui/react-key "abc"})

(defonce app (atom (uc/new-untangled-client :initial-state initial-state)))

