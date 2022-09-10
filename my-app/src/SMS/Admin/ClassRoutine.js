import React from "react"; import { Outlet, Link } from "react-router-dom";

function ClassRoutine() {
  return (
    <body>
      {/* <!-- Preloader Start Here --> */}
      <div id="preloader"></div>
      {/* <!-- Preloader End Here --> */}
      <div id="wrapper" className="wrapper bg-ash">
        {/* <!-- Header Menu Area Start Here --> */}
        <div className="navbar navbar-expand-md header-menu-one bg-light">
          <div className="nav-bar-header-one">
            <div className="header-logo"></div>
            <div className="toggle-button sidebar-toggle">
              <button type="button" className="item-link">
                <span className="btn-icon-wrap">
                  <span></span>
                  <span></span>
                  <span></span>
                </span>
              </button>
            </div>
          </div>
          <div className="d-md-none mobile-nav-bar">
            <button
              className="navbar-toggler pulse-animation"
              type="button"
              data-toggle="collapse"
              data-target="#mobile-navbar"
              aria-expanded="false"
            >
              <i className="far fa-arrow-alt-circle-down"></i>
            </button>
            <button type="button" className="navbar-toggler sidebar-toggle-mobile">
              <i className="fas fa-bars"></i>
            </button>
          </div>
          <div
            className="header-main-menu collapse navbar-collapse"
            id="mobile-navbar"
          >
            <ul className="navbar-nav"></ul>
            <ul className="navbar-nav"></ul>
          </div>
        </div>
        {/* <!-- Header Menu Area End Here -->
        <!-- Page Area Start Here --> */}
        <div className="dashboard-page-one">
          {/* <!-- Sidebar Area Start Here --> */}
          <div className="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
            <div className="mobile-sidebar-header d-md-none">
              <div className="header-logo">
                 <Link to="/">
                  <img src="img/logo1.png" alt="logo" />
               </Link>
              </div>
            </div>
            <div className="sidebar-menu-content">
              <ul className="nav nav-sidebar-menu sidebar-toggle-view">
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-classmates"></i>
                    <span>Students</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-student.html" className="nav-link">
                        <i className=""></i>All Students
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/student-details.html" className="nav-link">
                        <i className=""></i>Student Details
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/admit-form.html" className="nav-link">
                        <i className=""></i>Admission Form
                     </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-multiple-users-silhouette"></i>
                    <span>Teachers</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-teacher.html" className="nav-link">
                        <i className=""></i>All Teachers
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/teacher-details.html" className="nav-link">
                        <i className=""></i>Teacher Details
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/add-teacher.html" className="nav-link">
                        <i className=""></i>Add Teacher
                     </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-couple"></i>
                    <span>Parents</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-parents.html" className="nav-link">
                        <i className=""></i>All Parents
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/parents-details.html" className="nav-link">
                        <i className=""></i>Parents Details
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/add-parents.html" className="nav-link">
                        <i className=""></i>Add Parent
                     </Link>
                    </li>
                  </ul>
                </li>

                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-maths-class-materials-cross-of-a-pencil-and-a-ruler"></i>
                    <span>Class</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-class.html" className="nav-link">
                        <i className=""></i>All Classes
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/add-class.html" className="nav-link">
                        <i className=""></i>Add New Class
                     </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item">
                   <Link to="/all-subject.html" className="nav-link">
                    <i className="flaticon-open-book"></i>
                    <span>Subject</span>
                 </Link>
                </li>
                <li className="nav-item">
                   <Link to="/class-routine.html" className="nav-link menu-active">
                    <i className="flaticon-calendar"></i>
                    <span className="menu-active">Class Routine</span>
                 </Link>
                </li>
                <li className="nav-item">
                   <Link to="/student-attendence.html" className="nav-link">
                    <i className="flaticon-checklist"></i>
                    <span>Attendence</span>
                 </Link>
                </li>
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-shopping-list"></i>
                    <span>Exam</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/exam-schedule.html" className="nav-link">
                        <i className=""></i>Exam Schedule
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/exam-grade.html" className="nav-link">
                        <i className=""></i>Exam Grades
                     </Link>
                    </li>
                  </ul>
                </li>

                <li className="nav-item">
                   <Link to="/account-settings.html" className="nav-link">
                    <i className="flaticon-settings"></i>
                    <span>Account</span>
                 </Link>
                </li>
              </ul>
            </div>
          </div>
          {/* <!-- Sidebar Area End Here --> */}
          <div className="dashboard-content-one">
            {/* <!-- Breadcubs Area Start Here --> */}
            <div className="breadcrumbs-area">
              <h3>Class Routine</h3>
              <ul>
                <li>
                   <Link to="/">Home</Link>
                </li>
                <li>Routine</li>
              </ul>
            </div>
            {/* <!-- Breadcubs Area End Here -->
                <!-- Class Routine Area Start Here --> */}
            <div className="row">
              <div className="col-4-xxxl col-12">
                <div className="card height-auto">
                  <div className="card-body">
                    <div className="heading-layout1">
                      <div className="item-title">
                        <h3>Add Class Routine</h3>
                      </div>
                    </div>
                    <form className="new-added-form">
                      <div className="row">
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Subject Name *</label>
                          <input
                            type="text"
                            placeholder=""
                            className="form-control"
                          />
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Subject Type *</label>
                          <select className="select2">
                            <option value="">Please Select</option>
                            <option value="1">Bangla</option>
                            <option value="2">English</option>
                            <option value="3">Mathematics</option>
                            <option value="3">Economics</option>
                            <option value="3">Chemistry</option>
                          </select>
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Select Class *</label>
                          <select className="select2">
                            <option value="0">Please Select</option>
                            <option value="1">Play</option>
                            <option value="2">Nursery</option>
                            <option value="3">One</option>
                            <option value="3">Two</option>
                            <option value="3">Three</option>
                          </select>
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Select Code</label>
                          <select className="select2">
                            <option value="0">Please Select</option>
                            <option value="1">00524</option>
                            <option value="2">00525</option>
                            <option value="3">00526</option>
                            <option value="3">00527</option>
                            <option value="3">00528</option>
                          </select>
                        </div>
                        <div className="col-12 form-group mg-t-8">
                          <button
                            type="submit"
                            className="btn-fill-lg btn-gradient-yellow btn-hover-bluedark"
                          >
                            Save
                          </button>
                          <button
                            type="reset"
                            className="btn-fill-lg bg-blue-dark btn-hover-yellow"
                          >
                            Reset
                          </button>
                        </div>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
              <div className="col-8-xxxl col-12">
                <div className="card height-auto">
                  <div className="card-body">
                    <div className="heading-layout1">
                      <div className="item-title">
                        <h3>Class Routine</h3>
                      </div>
                    </div>
                    <form className="mg-b-20">
                      <div className="row gutters-8">
                        <div className="col-lg-4 col-12 form-group">
                          <input
                            type="text"
                            placeholder="Search by Day ..."
                            className="form-control"
                          />
                        </div>
                        <div className="col-lg-3 col-12 form-group">
                          <input
                            type="text"
                            placeholder="Search by Class ..."
                            className="form-control"
                          />
                        </div>
                        <div className="col-lg-3 col-12 form-group">
                          <input
                            type="text"
                            placeholder="Search by Section ..."
                            className="form-control"
                          />
                        </div>
                        <div className="col-lg-2 col-12 form-group">
                          <button
                            type="submit"
                            className="fw-btn-fill btn-gradient-yellow"
                          >
                            SEARCH
                          </button>
                        </div>
                      </div>
                    </form>
                    <div className="table-responsive">
                      <table className="table display data-table text-nowrap">
                        <thead>
                          <tr>
                            <th>
                              <div className="form-check">
                                <input
                                  type="checkbox"
                                  className="form-check-input checkAll"
                                />
                                <label className="form-check-label">Day</label>
                              </div>
                            </th>
                            <th>Class</th>
                            <th>Subject</th>
                            <th>Section</th>
                            <th>Teacher</th>
                            <th>Time</th>
                            <th>Date</th>
                            <th></th>
                          </tr>
                        </thead>
                        <tbody></tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            {/* <!-- Class Routine Area End Here --> */}
            <footer className="footer-wrap-layout1"></footer>
          </div>
        </div>
        {/* <!-- Page Area End Here --> */}
      </div>
    </body>
  );
}

export default ClassRoutine;