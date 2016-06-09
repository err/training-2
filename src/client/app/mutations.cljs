(ns app.mutations
  (:require [untangled.client.mutations :as m]))

(defmethod m/mutate 'set-to-tony [{:keys [state]} sym params]
  {:action (fn [] (swap! state assoc :value "Tony"))})
