(ns interop.react-navigation.react-navigation-4x.drawer-v1
  (:require [react-navigation-drawer :as module]
            [reagent.core :as r]
            [goog.object :as gobject]
            [interop.react-navigation.react-navigation-4x.utils-v1 :as utils]))

(assert module)

(defn create-drawer-navigator [r c] (module/createDrawerNavigator (utils/map->js r :keywordize-keys str) (clj->js c)))

;(def DrawerGestureContext module/DrawerGestureContext)
;(def DrawerRouter module/DrawerRouter)
;(def DrawerActions module/DrawerActions)
;(def DrawerView module/DrawerView)
;(def DrawerItems module/DrawerItems)
;(def DrawerSidebar module/DrawerSidebar)

