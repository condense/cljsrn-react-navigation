(ns interop.react-navigation.react-navigation-4x.tabs-v1
  (:require [react-navigation-tabs :as module]
            [reagent.core :as r]
            [interop.react-navigation.react-navigation-4x.utils-v1 :as utils]))

(assert module)

; https://github.com/react-navigation/react-navigation/blob/4.x/packages/tabs/src/index.tsx
(defn create-tab-navigator [r c] (module/createTabNavigator (utils/map->js r :keywordize-keys str) (clj->js c)))
(defn create-bottom-tab-navigator [r c] (module/createBottomTabNavigator (map->js r) (clj->js c)))
(defn create-material-top-tab-navigator [r c] (module/createMaterialTopTabNavigator (map->js r) (clj->js c)))
(def BottomTabBar (r/adapt-react-class module/BottomTabBar))
(def MaterialTopTabBar (r/adapt-react-class module/MaterialTopTabBar))

;(def BottomTabBarProps module/BottomTabBarProps)
;(def NavigationTabState module/NavigationTabState)
;(def NavigationTabProp module/NavigationTabProp)
;(def NavigationTabScreenProps module/NavigationTabScreenProps)
;(def NavigationBottomTabOptions module/NavigationBottomTabOptions)
;(def NavigationMaterialTabOptions module/NavigationMaterialTabOptions)
;(def NavigationBottomTabScreenComponent module/NavigationBottomTabScreenComponent)
;(def NavigationMaterialTabScreenComponent module/NavigationMaterialTabScreenComponent)
