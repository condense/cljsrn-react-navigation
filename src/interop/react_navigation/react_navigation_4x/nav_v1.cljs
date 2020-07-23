(ns interop.react-navigation.react-navigation-4x.nav-v1
  (:refer-clojure :exclude [pop replace])
  (:require [react-navigation :as module]
            [reagent.core :as r]
            [interop.react-navigation.react-navigation-4x.utils-v1 :as utils]))

(println ::hello)

(assert module)

(def createAppContainer module/createAppContainer)
(def createConfigGetter module/createConfigGetter)
(def createKeyboardAwareNavigator module/createKeyboardAwareNavigator)
(def createNavigationAwareScrollable module/createNavigationAwareScrollable)
(def createNavigationFactory module/createNavigationFactory)
(def createNavigator module/createNavigator)
(def createSwitchNavigator module/createSwitchNavigator)
(def getActiveChildNavigationOptions module/getActiveChildNavigationOptions)
(def getNavigation module/getNavigation)
(def getScreenForRouteName module/getScreenForRouteName)
(def pathUtils module/pathUtils)
(def useTheme module/useTheme)
(def validateRouteConfigMap module/validateRouteConfigMap)
(def withNavigation module/withNavigation)
(def withNavigationFocus module/withNavigationFocus)
(def withOrientation module/withOrientation)
(def FlatList module/FlatList)
(def NavigationActions module/NavigationActions)
(def NavigationConsumer module/NavigationConsumer)
(def NavigationContainer module/NavigationContainer)
(def NavigationContext module/NavigationContext)
(def NavigationEvents module/NavigationEvents)
(def NavigationProvider module/NavigationProvider)
(def ResourceSavingSceneView module/ResourceSavingSceneView)
(def SafeAreaView module/SafeAreaView)
(def SceneView module/SceneView)
(def ScrollView module/ScrollView)
(def SectionList module/SectionList)
(def StackActions module/StackActions)
(def StackRouter module/StackRouter)
(def StateUtils module/StateUtils)
(def SwitchActions module/SwitchActions)
(def SwitchRouter module/SwitchRouter)
(def SwitchView module/SwitchView)
(def TabRouter module/TabRouter)
(def ThemeColors module/ThemeColors)
(def ThemeConsumer module/ThemeConsumer)
(def ThemeContext module/ThemeContext)
(def ThemeProvider module/ThemeProvider)
(def Themed module/Themed)

; NavigationActions
(defn back [m] (module/NavigationActions.navigate (utils/map->js m)))
(defn init [m] (module/NavigationActions.navigate (utils/map->js m)))
(defn navigate [m] (module/NavigationActions.navigate (utils/map->js m)))
(defn set-params [m] (module/NavigationActions.navigate (utils/map->js m)))

; StackActions
(defn pop [m] (module/StackActions.pop (utils/map->js m)))
(defn pop-to-top [m] (module/StackActions.popToTop (utils/map->js m)))
(defn push [m] (module/StackActions.push (utils/map->js m)))
(defn reset [m] (module/StackActions.reset (utils/map->js m)))
(defn replace [m] (module/StackActions.replace (utils/map->js m)))
(defn complete-transition [m] (module/StackActions.completeTransition (utils/map->js m)))

; SwitchActions
(defn jump-to [m] (module/SwitchActions.jumpTo (utils/map->js m)))

; Navigation
(defn dispatch [^js/ReactNavigation.Navigation n m] (.dispatch n (utils/map->js m)))
(defn get-state [^js/ReactNavigation.Navigation n] (js->clj (gobject/get n "state") :keywordize-keys true))
(defn set-state [^js/ReactNavigation.Navigation n s] (.setState n s))

(comment

  (ns awesome-project.core
    (:require [reagent.core :as r]
              [reagent.react-native :as rn]
              [interop.react-navigation.react-navigation-4x.nav-v1 :as nav]
              [interop.react-navigation.react-navigation-4x.stack-v1 :as stack]))

  (def *navigator (atom nil))

  (defn page1 [props]
    [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
     [rn/text {:style {:font-size 50}} "Page 1"]
     [rn/button {:onPress #(.dispatch @*navigator (navigate {:routeName (str routeName) :params {}}))
                 :title "go!"}]])

  (defn page2 []
    [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
     [rn/text {:style {:font-size 50}} "Page 2"]])

  (def MainNavigator
    (stack/create-stack-navigator
      {::page1 (r/reactify-component page1)
       ::page2 (r/reactify-component page2)}
      {:initialRouteName (str ::page1)}))

  (def AppContainer (nav/createAppContainer MainNavigator))

  (defn app [] [:> AppContainer {:ref #(reset! *navigator %)}]))
